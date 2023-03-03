package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPromoteRsp {
    @Tag(tag=11) public Long guid = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
