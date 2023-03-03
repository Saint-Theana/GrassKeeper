package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetTalkChangeNotify {
    @Tag(tag=5) public Integer gadgetEntityId = null;
    @Tag(tag=15) public Integer curGadgetTalkState = null;
}
