package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PrivateChatRsp {
    @Tag(tag=12) public Integer chatForbiddenEndtime = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
