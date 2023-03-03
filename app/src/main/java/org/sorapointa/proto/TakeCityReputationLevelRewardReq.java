package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCityReputationLevelRewardReq {
    @Tag(tag=11) public Integer level = null;
    @Tag(tag=1) public Integer cityId = null;
}
