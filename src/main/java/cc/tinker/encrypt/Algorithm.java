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
package cc.tinker.encrypt;

/**
 * <p>
 * 算法类型枚举类
 * </p>
 * 
 * @author hubin
 * @Date 2016-01-20
 */
public enum Algorithm {
	DES("DES", "DES encrypt"), AES("AES", "AES encrypt"), BLOWFISH("BLOWFISH", "Blowfish encrypt"), RC2("RC2",
			"RC2 encrypt"), RC4("RC4", "RC4 encrypt");

	/** 主键 */
	private final String key;

	/** 描述 */
	private final String desc;

	Algorithm(final String key, final String desc) {
		this.key = key;
		this.desc = desc;
	}

	public String getKey() {
		return this.key;
	}

	public String getDesc() {
		return this.desc;
	}

	public static Algorithm convert(String encryptAlgorithm) {
		Algorithm algorithm = Algorithm.RC4;
		if (null != encryptAlgorithm) {
			Algorithm[] algs = Algorithm.values();
			for (Algorithm alg : algs) {
				if (alg.getKey().equals(encryptAlgorithm)) {
					algorithm = alg;
					break;
				}
			}
		}
		return algorithm;
	}

}
