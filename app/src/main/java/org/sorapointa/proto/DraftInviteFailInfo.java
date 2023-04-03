package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DraftInviteFailReason.*;
import org.sorapointa.proto.DraftInviteFailReason;

public class DraftInviteFailInfo {
    @Tag(tag=9) public Integer reason = null;
    @Tag(tag=1) public Integer uid = null;
}
