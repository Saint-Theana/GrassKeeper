package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;

public class GadgetChangeLevelTagReq {
    @Tag(tag=14) public Integer levelTagId = null;
    @Tag(tag=11) public CustomGadgetTreeInfo combinationInfo = null;
    @Tag(tag=10) public Integer gadgetEntityId = null;
}
