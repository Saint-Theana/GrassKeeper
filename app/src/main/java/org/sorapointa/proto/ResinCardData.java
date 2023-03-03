package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ResinCardData {
    @Tag(tag=3) public Integer remainRewardDays = null;
    @Tag(tag=12) public Integer expireTime = null;
    @Tag(tag=2) public Integer lastDailyRewardTime = null;
    @Tag(tag=7) public Integer configId = null;
}
