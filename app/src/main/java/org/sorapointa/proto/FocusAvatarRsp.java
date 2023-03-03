package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FocusAvatarRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Boolean isFocus = null;
    @Tag(tag=4) public Long avatarGuid = null;
}
