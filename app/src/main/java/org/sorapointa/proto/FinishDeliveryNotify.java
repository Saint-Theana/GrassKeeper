package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishDeliveryNotify {
    @Tag(tag=1) public Integer finishedQuestIndex = null;
    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=12) public Integer dayIndex = null;
}
