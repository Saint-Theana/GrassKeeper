package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgWaitingListChange {
    @Tag(tag=6) public Integer curIndex = null;
    @Tag(tag=4) public Integer controllerId = null;
}
