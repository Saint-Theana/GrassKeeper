package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeAnimHashRsp {
    @Tag(tag=13) public Integer animHash = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Long avatarGuid = null;
}
