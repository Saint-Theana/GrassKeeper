package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeAvatarRsp {
    @Tag(tag=3) public Integer skillId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Long curGuid = null;
}
