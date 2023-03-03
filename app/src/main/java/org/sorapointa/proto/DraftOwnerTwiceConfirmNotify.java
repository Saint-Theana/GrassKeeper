package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftOwnerTwiceConfirmNotify {
    @Tag(tag=15) public Integer twiceConfirmDeadlineTime = null;
    @Tag(tag=14) public Integer draftId = null;
}
