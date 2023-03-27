package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ResinCardData {
    @Tag(tag=14) public Integer configId = null;
    @Tag(tag=10) public Integer remainRewardDays = null;
    @Tag(tag=5) public Integer expireTime = null;
    @Tag(tag=7) public Integer lastDailyRewardTime = null;
}
