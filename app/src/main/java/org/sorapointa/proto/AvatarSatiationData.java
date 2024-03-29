package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSatiationData {
    @Tag(tag=5) public Long avatarGuid = null;
    @Tag(tag=15,isFloat=true) public Float finishTime = null;
    @Tag(tag=12,isFloat=true) public Float penaltyFinishTime = null;
}
