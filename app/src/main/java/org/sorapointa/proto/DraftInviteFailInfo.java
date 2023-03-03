package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DraftInviteFailReason.*;
import org.sorapointa.proto.DraftInviteFailReason;

public class DraftInviteFailInfo {
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=5) public Integer reason = null;
}
