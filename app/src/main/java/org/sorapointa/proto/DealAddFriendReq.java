package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DealAddFriendResultType.*;
import org.sorapointa.proto.DealAddFriendResultType;

public class DealAddFriendReq {
    @Tag(tag=12) public Integer dealAddFriendResult = null;
    @Tag(tag=10) public Integer targetUid = null;
}
