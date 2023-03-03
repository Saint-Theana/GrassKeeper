package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerUpdateGlobalValueNotify {
    public enum UpdateType {
        @Tag(tag=0) UPDATE_TYPE_INVALID ,
        @Tag(tag=1) UPDATE_TYPE_ADD ,
        @Tag(tag=2) UPDATE_TYPE_SET ;
    }

    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=13) public UpdateType updateType = null;
    @Tag(tag=3,isFloat=true) public Float delta = null;
    @Tag(tag=10) public Integer keyHash = null;
    @Tag(tag=6,isFloat=true) public Float value = null;
}
