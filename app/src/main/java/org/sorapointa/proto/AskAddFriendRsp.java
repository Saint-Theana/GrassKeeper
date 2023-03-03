package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AskAddFriendRsp {
    @Tag(tag=8) public Integer param = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer targetUid = null;
}
