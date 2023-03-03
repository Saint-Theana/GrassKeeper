package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeCostumeRsp {
    @Tag(tag=12) public Long avatarGuid = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer costumeId = null;
}
