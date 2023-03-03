package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanTakeRewardReq {
    @Tag(tag=8) public Integer position = null;
    @Tag(tag=7) public Integer scheduleId = null;
}
