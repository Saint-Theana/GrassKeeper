package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DealAddFriendResultType.*;
import org.sorapointa.proto.DealAddFriendResultType;

public class DealAddFriendRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer targetUid = null;
    @Tag(tag=6) public Integer dealAddFriendResult = null;
}
