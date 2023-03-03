package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeKickPlayerRsp {
    @Tag(tag=4) public Integer targetUid = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Boolean isKickAll = null;
}
