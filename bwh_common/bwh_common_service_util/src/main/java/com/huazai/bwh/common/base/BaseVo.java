package com.huazai.bwh.common.base;


import java.io.Serializable;

public class BaseVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    public BaseVo() {
    }

    public String getId() {
        return this.id;
    }

    public BaseVo setId(String id) {
        this.id = id;
        return this;
    }

    public String toString() {
        return "BaseVo(id=" + this.getId() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseVo)) {
            return false;
        } else {
            BaseVo other = (BaseVo) o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseVo;
    }

    public int hashCode() {
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        return result;
    }
}
