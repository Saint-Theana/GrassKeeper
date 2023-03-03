package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GivingRecord.*;
import org.sorapointa.proto.GivingRecord;

public class GivingRecordChangeNotify {
    @Tag(tag=11) public Boolean isDeactive = null;
    @Tag(tag=15) public GivingRecord givingRecord = null;
}
