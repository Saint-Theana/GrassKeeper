package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftOwnerInviteNotify {
    @Tag(tag=4) public Integer draftId = null;
    @Tag(tag=15) public Integer inviteDeadlineTime = null;
}
