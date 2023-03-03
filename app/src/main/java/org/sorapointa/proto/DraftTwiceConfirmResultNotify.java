package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DraftTwiceConfirmResultNotify {
    @Tag(tag=7) public Boolean isAllAgree = null;
    @Tag(tag=1) public Integer draftId = null;
}
