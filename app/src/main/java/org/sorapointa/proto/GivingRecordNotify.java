package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GivingRecord.*;
import org.sorapointa.proto.GivingRecord;

public class GivingRecordNotify {
    @Tag(tag=14) public List<GivingRecord> givingRecordList = new ArrayList<>();
}
