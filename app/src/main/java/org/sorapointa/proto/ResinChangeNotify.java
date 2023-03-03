package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ResinChangeNotify {
    @Tag(tag=6) public Integer nextAddTimestamp = null;
    @Tag(tag=4) public Integer curBuyCount = null;
    @Tag(tag=12) public Integer curValue = null;
}
