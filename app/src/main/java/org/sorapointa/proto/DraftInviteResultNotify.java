package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftInviteResultNotify {
    @Tag(tag=9) public Boolean isAllAgree = null;
    @Tag(tag=13) public Integer draftId = null;
}
