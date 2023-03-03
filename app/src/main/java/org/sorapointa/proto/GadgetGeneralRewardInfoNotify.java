package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GadgetGeneralRewardInfo.*;
import org.sorapointa.proto.GadgetGeneralRewardInfo;

public class GadgetGeneralRewardInfoNotify {
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=9) public GadgetGeneralRewardInfo generalRewardInfo = null;
}
