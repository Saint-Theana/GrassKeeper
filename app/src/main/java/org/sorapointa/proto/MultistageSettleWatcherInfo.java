package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistageSettleWatcherInfo {
    @Tag(tag=13) public Integer totalProgress = null;
    @Tag(tag=5) public Integer curProgress = null;
    @Tag(tag=7) public Integer watcherId = null;
    @Tag(tag=12) public Boolean isInverse = null;
}
