package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;

public class GadgetCustomTreeInfoNotify {
    @Tag(tag=5) public CustomGadgetTreeInfo customGadgetTreeInfo = null;
    @Tag(tag=12) public Integer gadgetEntityId = null;
}
