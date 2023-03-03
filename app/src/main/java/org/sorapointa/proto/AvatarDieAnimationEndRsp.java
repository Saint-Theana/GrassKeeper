package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarDieAnimationEndRsp {
    @Tag(tag=13) public Integer skillId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Long dieGuid = null;
}
