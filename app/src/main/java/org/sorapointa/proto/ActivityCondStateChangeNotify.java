package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class ActivityCondStateChangeNotify {
    @Tag(tag=9) public List<Integer> activatedSaleIdList = new ArrayList<>();
    @Tag(tag=4) public Integer activityId = null;
    @Tag(tag=5) public Integer scheduleId = null;
    @Tag(tag=11) public List<Integer> expireCondList = new ArrayList<>();
    @Tag(tag=12) public List<Uint32Pair> disableTransferPointInteractionList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> meetCondList = new ArrayList<>();
}
