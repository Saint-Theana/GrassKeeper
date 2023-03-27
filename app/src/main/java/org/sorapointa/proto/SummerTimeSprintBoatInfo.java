package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatInfo {
    @Tag(tag=14) public List<SummerTimeSprintBoatRecord> recordList = new ArrayList<>();
}
