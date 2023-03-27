package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistageSettleWatcherInfo {
    @Tag(tag=1) public Integer curProgress = null;
    @Tag(tag=8) public Integer totalProgress = null;
    @Tag(tag=5) public Integer watcherId = null;
    @Tag(tag=10) public Boolean isInverse = null;
}
