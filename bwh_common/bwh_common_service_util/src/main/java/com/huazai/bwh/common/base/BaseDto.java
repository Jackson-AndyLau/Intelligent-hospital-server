package com.huazai.bwh.common.base;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class BaseDto implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("每页大小")
    private long size = 10L;
    @ApiModelProperty("当前页")
    private long current = 1L;
    @ApiModelProperty("主键ID")
    private String id;

    public BaseDto() {
    }

    public long getSize() {
        return this.size;
    }

    public long getCurrent() {
        return this.current;
    }

    public String getId() {
        return this.id;
    }

    public BaseDto setSize(long size) {
        this.size = size;
        return this;
    }

    public BaseDto setCurrent(long current) {
        this.current = current;
        return this;
    }

    public BaseDto setId(String id) {
        this.id = id;
        return this;
    }

    public String toString() {
        return "BaseDto(size=" + this.getSize() + ", current=" + this.getCurrent() + ", id=" + this.getId() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseDto)) {
            return false;
        } else {
            BaseDto other = (BaseDto) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getSize() != other.getSize()) {
                return false;
            } else if (this.getCurrent() != other.getCurrent()) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id == null) {
                        return true;
                    }
                } else if (this$id.equals(other$id)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseDto;
    }

    public int hashCode() {
        int result = 1;
        long $size = this.getSize();
        result = result * 59 + (int) ($size >>> 32 ^ $size);
        long $current = this.getCurrent();
        result = result * 59 + (int) ($current >>> 32 ^ $current);
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        return result;
    }
}