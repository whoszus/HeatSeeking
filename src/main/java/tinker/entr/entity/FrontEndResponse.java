package tinker.entr.entity;

/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
public class FrontEndResponse {
    private Boolean success;
    private Object message;

    public FrontEndResponse() {
        this(Boolean.valueOf(true), "操作成功");
    }

    public FrontEndResponse(Boolean success) {
        this(success, "操作成功");
    }

    public FrontEndResponse(Boolean success, Object message) {
        this.success = success;
        this.message = message;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getMessage() {
        return this.message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
