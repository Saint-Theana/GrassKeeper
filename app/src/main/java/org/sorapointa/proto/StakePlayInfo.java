package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeStakePlayRecord.*;
import org.sorapointa.proto.HomeStakePlayRecord;

public class StakePlayInfo {
    @Tag(tag=14) public List<HomeStakePlayRecord> recordList = new ArrayList<>();
}
