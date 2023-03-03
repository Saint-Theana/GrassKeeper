package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeSprintBoatRecord.*;
import org.sorapointa.proto.SummerTimeSprintBoatRecord;

public class SummerTimeSprintBoatInfo {
    @Tag(tag=7) public List<SummerTimeSprintBoatRecord> recordList = new ArrayList<>();
}
