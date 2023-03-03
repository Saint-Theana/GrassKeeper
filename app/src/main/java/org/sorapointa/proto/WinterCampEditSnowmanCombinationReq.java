package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;

public class WinterCampEditSnowmanCombinationReq {
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=6) public CustomGadgetTreeInfo combinationInfo = null;
}
