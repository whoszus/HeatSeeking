/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cc.tinker.utils;


import java.nio.charset.Charset;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * <p>
 * SSO 配置文件解析
 * </p>
 * <p>
 * 按照不同的运行模式启用相应的配置 默认开发环境， 调试方式 Eclipse 环境的 VM 参数中加上 -Dsso.run.mode=dev_mode
 * 例如： 
 * ------------------------------------------------------------------
 * sso.login.url_online_mode=http://sso.online.com/login.html
 * sso.login.url_test_mode=http://sso.test.com/login.html
 * sso.login.url_dev_mode=http://localhost:8080/login.html
 * ------------------------------------------------------------------
 * </p>
 * 
 * @author hubin
 * @Date 2015-12-05
 */
public class SSOConfig {
	private static final Logger logger = Logger.getLogger("SSOConfig");
	private static final String SSO_ENCODING = "UTF-8";
	private String runMode = "online_mode";
	private String role = "";
	private String encoding = SSO_ENCODING;
	private String secretkey = "p00Tm071X992t3Eg05";
	private String cookieName = "uid";
	private String cookieDomain = "";
	private String cookiePath = "/";
	private boolean cookieSecure = false;
	private boolean cookieHttponly = true;
	private int cookieMaxage = -1;
	private boolean cookieBrowser = true;
	private boolean cookieCheckip = false;
	private String loginUrl = "";
	private String logoutUrl = "";
	private String paramReturl = "ReturnURL";
	private String authCookieSecretkey = "Lg8V51188n0709i5l81";
	private String authCookieName = "pid";
	private int authCookieMaxage = 180;
	private String tokenClass = null;
	private int cacheExpires = -1;

	/**
	 * 对称加密算法（默认 RC4）
	 */
	private String encryptAlgorithm = null;

	/**
	 * 权限认证（默认 false）
	 */
	private boolean permissionUri = false;

	/**
	 * 插件列表
	 */
//	private static List<SSOPlugin> SSO_PLUGIN_LIST = null;

	/**
	 * <p>
	 * 拦截器判断后设置 Token至当前请求，减少Token解密次数： request.setAttribute("ssotoken_attr",
	 * token)
	 * </p>
	 * <p>
	 * 使用获取方式： SSOHelper.attrToken(request)
	 * </p>
	 */
	public static final String SSO_TOKEN_ATTR = "SSOTokenAttr";

	/**
	 * 踢出用户逻辑标记
	 */
	public static final String SSO_KICK_FLAG = "SSOKickFlag";
	public static final String SSO_KICK_USER = "SSOKickUser";

	/**
	 * SSO 动态设置 Cookie 参数
	 * <p>
	 * -1 浏览器关闭时自动删除 0 立即删除 120 表示Cookie有效期2分钟(以秒为单位)
	 * </p>
	 */
	public static final String SSO_COOKIE_MAXAGE = "sso_cookie_maxage";

	/**
	 * Charset 类型编码格式
	 */
	public static final Charset CHARSET_ENCODING = Charset.forName(getSSOEncoding());

	public static final String CUT_SYMBOL = "#";

	/**
	 * 运行模式
	 */
	private static final String SSO_RUN_MODE = "sso.run.mode";

	/**
	 * Properties 配置文件
	 */
	private SSOProperties properties = null;
	private static SSOConfig SSO_CONFIG = null;

	public SSOConfig() {
		/* 支持 setInstance 设置初始化 */
	}

	public SSOConfig(SSOProperties properties) {
		this.properties = properties;
	}

	/**
	 * new 当前对象
	 */
	public static SSOConfig getInstance() {
		if (SSO_CONFIG == null) {
			SSO_CONFIG = new SSOConfig();
		}
		return SSO_CONFIG;
	}

	/**
	 * 设置初始化（可动态修改配置内容）
	 */
	public synchronized static void setInstance(SSOConfig ssoConfig) {
		if (ssoConfig == null) {
			throw new KissoException(" setInstance error, ssoConfig is null.");
		} else {
			SSO_CONFIG = ssoConfig;
			logger.config("loading kisso config.");
			logger.info("kisso init success.");
		}
	}

	/**
	 * SSO 资源文件初始化
	 */
	public synchronized void initProperties(Properties props) {
		if (props != null) {
			setInstance(new SSOConfig(new SSOProperties(props, SSO_RUN_MODE, this.getRunMode())));
		} else {
			throw new KissoException(" cannot load kisso config. ");
		}
	}

	/**
	 * SSO 配置工具类
	 * 
	 * @return {@link PropertiesUtil}
	 */
	public static SSOProperties getSSOProperties() {
		return SSO_CONFIG.getProperties();
	}

	/**
	 * SSO 当前编码格式
	 */
	public static String getSSOEncoding() {
		if (SSO_CONFIG == null) {
			return SSO_ENCODING;
		}
		return getInstance().getEncoding();
	}

	public SSOProperties getProperties() {
		return properties;
	}

	public void setProperties(SSOProperties properties) {
		this.properties = properties;
	}

	/**
	 * SSO 配置模式
	 * <p>
	 * --------------------
	 * dev_mode 开发模式 test_mode 测试模式 online_mode 生产模式
	 * --------------------
	 * </p>
	 */
	public String getRunMode() {
		if (properties == null) {
			return runMode;
		}
		return properties.get(SSO_RUN_MODE, runMode);
	}

	public void setRunMode(String runMode) {
		this.runMode = runMode;
	}

	/**
	 * 系统角色（默认 空）
	 * <p>
	 * 该属性为跨域区分当前系统使用，与 token 变量应用系统 app 参数自动设置为该属性值。
	 * </p>
	 * <p>
	 * 该值非空则自动开启跨域功能，单点登录系统名必须设置为 sso.role=sso
	 * </p>
	 */
	public String getRole() {
		if (properties == null) {
			return role;
		}
		return properties.get("sso.role", role);
	}

	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 编码格式默认 UTF-8
	 */
	public String getEncoding() {
		if (properties == null) {
			return encoding;
		}
		return properties.get("sso.encoding", encoding);
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * 密钥
	 */
	public String getSecretkey() {
		if (properties == null) {
			return secretkey;
		}
		return properties.get("sso.secretkey", secretkey);
	}

	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

	/**
	 * Cookie 名称
	 */
	public String getCookieName() {
		if (properties == null) {
			return cookieName;
		}
		return properties.get("sso.cookie.name", cookieName);
	}

	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}

	/**
	 * Cookie 所在域
	 */
	public String getCookieDomain() {
		if (properties == null) {
			return cookieDomain;
		}
		return properties.get("sso.cookie.domain", cookieDomain);
	}

	public void setCookieDomain(String cookieDomain) {
		this.cookieDomain = cookieDomain;
	}

	/**
	 * Cookie 域路径
	 */
	public String getCookiePath() {
		if (properties == null) {
			return cookiePath;
		}
		return properties.get("sso.cookie.path", cookiePath);
	}

	public void setCookiePath(String cookiePath) {
		this.cookiePath = cookiePath;
	}

	/**
	 * Cookie 只允许https协议传输
	 */
	public boolean getCookieSecure() {
		if (properties == null) {
			return cookieSecure;
		}
		return properties.getBoolean("sso.cookie.secure", cookieSecure);
	}

	public void setCookieSecure(boolean cookieSecure) {
		this.cookieSecure = cookieSecure;
	}

	/**
	 * Cookie 只读, 不允许 Js访问
	 */
	public boolean getCookieHttponly() {
		if (properties == null) {
			return cookieHttponly;
		}
		return properties.getBoolean("sso.cookie.httponly", cookieHttponly);
	}

	public void setCookieHttponly(boolean cookieHttponly) {
		this.cookieHttponly = cookieHttponly;
	}

	/**
	 * Cookie 超时时间
	 * <p>
	 * -1 浏览器关闭时自动删除 0 立即删除 120 表示Cookie有效期2分钟(以秒为单位)
	 * </p>
	 */
	public int getCookieMaxage() {
		if (properties == null) {
			return cookieMaxage;
		}
		return properties.getInt("sso.cookie.maxage", cookieMaxage);
	}

	public void setCookieMaxage(int cookieMaxage) {
		this.cookieMaxage = cookieMaxage;
	}

	/**
	 * Cookie 开启浏览器版本校验
	 */
	public boolean getCookieBrowser() {
		if (properties == null) {
			return cookieBrowser;
		}
		return properties.getBoolean("sso.cookie.browser", cookieBrowser);
	}

	public void setCookieBrowser(boolean cookieBrowser) {
		this.cookieBrowser = cookieBrowser;
	}

	/**
	 * Cookie 开启IP校验
	 */
	public boolean getCookieCheckip() {
		if (properties == null) {
			return cookieCheckip;
		}
		return properties.getBoolean("sso.cookie.checkip", cookieCheckip);
	}

	public void setCookieCheckip(boolean cookieCheckip) {
		this.cookieCheckip = cookieCheckip;
	}

	/**
	 * SSO 登录地址
	 */
	public String getLoginUrl() {
		if (properties == null) {
			return loginUrl;
		}
		return properties.get("sso.login.url", loginUrl);
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	/**
	 * SSO 退出地址
	 */
	public String getLogoutUrl() {
		if (properties == null) {
			return logoutUrl;
		}
		return properties.get("sso.logout.url", logoutUrl);
	}

	public void setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
	}

	/**
	 * SSO 跳转参数命名
	 * <p>
	 * 默认：ReturnURL
	 * </p>
	 */
	public String getParamReturl() {
		if (properties == null) {
			return paramReturl;
		}
		return properties.get("sso.param.returl", paramReturl);
	}

	public void setParamReturl(String paramReturl) {
		this.paramReturl = paramReturl;
	}

	/**
	 * 跨域 AuthCookie 密钥
	 */
	public String getAuthCookieSecretkey() {
		if (properties == null) {
			return authCookieSecretkey;
		}
		return properties.get("sso.authcookie.secretkey", authCookieSecretkey);
	}

	public void setAuthCookieSecretkey(String authCookieSecretkey) {
		this.authCookieSecretkey = authCookieSecretkey;
	}

	/**
	 * 跨域 AuthCookie 名称
	 */
	public String getAuthCookieName() {
		if (properties == null) {
			return authCookieName;
		}
		return properties.get("sso.authcookie.name", authCookieName);
	}

	public void setAuthCookieName(String authCookieName) {
		this.authCookieName = authCookieName;
	}

	/**
	 * 跨域 AuthCookie 超时时间
	 * <p>
	 * -1 浏览器关闭时自动删除 0 立即删除 120 表示Cookie有效期2分钟(以秒为单位)
	 * </p>
	 */
	public int getAuthCookieMaxage() {
		if (properties == null) {
			return authCookieMaxage;
		}
		return properties.getInt("sso.authcookie.maxage", authCookieMaxage);
	}

	public void setAuthCookieMaxage(int authCookieMaxage) {
		this.authCookieMaxage = authCookieMaxage;
	}

	/**
	 * 自定义 Token Class
	 */
	public Token getToken() {
		if (properties == null) {
			return SSOReflectHelper.getConfigToken(tokenClass);
		}
		return SSOReflectHelper.getConfigToken(properties.get("sso.token.class", ""));
	}

	public void setTokenClass(String tokenClass) {
		this.tokenClass = tokenClass;
	}

	/**
	 * 自定义 SSOParser Class
	 */
	public SSOParser getParser() {
		if (properties == null) {
			return SSOReflectHelper.getConfigParser(null);
		}
		return SSOReflectHelper.getConfigParser(properties.get("sso.parser.class", ""));
	}

	public void setParser(SSOParser parser) {
		if (parser != null) {
			SSOReflectHelper.setConfigParser(parser);
		}
	}

	/**
	 * 自定义 SSOEncrypt Class
	 */
	public SSOEncrypt getEncrypt() {
		if (properties == null) {
			return SSOReflectHelper.getConfigEncrypt(null, this.getEncryptAlgorithm());
		}
		return SSOReflectHelper.getConfigEncrypt(properties.get("sso.encrypt.class", ""), this.getEncryptAlgorithm());
	}

	public void setEncrypt(SSOEncrypt encrypt) {
		if (encrypt != null) {
			SSOReflectHelper.setConfigEncrypt(encrypt);
		}
	}

	/**
	 * 自定义 SSOCache Class
	 */
	public SSOCache getCache() {
		if (properties == null) {
			return SSOReflectHelper.getConfigCache(null);
		}
		return SSOReflectHelper.getConfigCache(properties.get("sso.cache.class", ""));
	}

	public void setCache(SSOCache cache) {
		if (cache != null) {
			SSOReflectHelper.setConfigCache(cache);
		}
	}

	/**
	 * 自定义SSOCache Expires
	 * <P>
	 * 缓存过期时间，小于0不过期，单位时间 s 秒
	 * </p>
	 * <p>
	 * 设置缓存Token 如缓存不存在将自动退出登录
	 * </p>
	 */
	public int getCacheExpires() {
		if (properties == null) {
			return cacheExpires;
		}
		return properties.getInt("sso.cache.expires", cacheExpires);
	}

	public void setCacheExpires(int cacheExpires) {
		this.cacheExpires = cacheExpires;
	}

	/**
	 * 自定义 SSOStatistic Class
	 */
	public SSOStatistic getStatistic() {
		if (properties == null) {
			return SSOReflectHelper.getConfigStatistic(null);
		}
		return SSOReflectHelper.getConfigStatistic(properties.get("sso.statistic.class", ""));
	}

	public void setStatistic(SSOStatistic statistic) {
		if (statistic != null) {
			SSOReflectHelper.setConfigStatistic(statistic);
		}
	}

	public String getEncryptAlgorithm() {
		if (properties == null) {
			return encryptAlgorithm;
		}
		return properties.get("sso.encrypt.algorithm", encryptAlgorithm);
	}

	public void setEncryptAlgorithm(String encryptAlgorithm) {
		this.encryptAlgorithm = encryptAlgorithm;
	}

	/**
	 * 权限是否验证 URI 地址
	 */
	public boolean isPermissionUri() {
		if (properties == null) {
			return permissionUri;
		}
		return properties.getBoolean("sso.permission.uri", permissionUri);
	}

	public void setPermissionUri(boolean permissionUri) {
		this.permissionUri = permissionUri;
	}

	/**
	 * 自定义插件列表
	 */
	public List<SSOPlugin> getPluginList() {
		return SSO_PLUGIN_LIST;
	}

	public void setPluginList(List<SSOPlugin> pluginList) {
		SSO_PLUGIN_LIST = pluginList;
	}

	/**
	 * 
	 * <p>
	 * 生成 Token 缓存主键
	 * </p>
	 * 
	 * @param userId
	 *            用户ID
	 * @return
	 */
	public static String toCacheKey(Object userId) {
		StringBuffer ck = new StringBuffer();
		ck.append("ssoTokenKey_");
		ck.append(userId);
		return ck.toString();
	}
}
