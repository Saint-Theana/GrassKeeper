package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WaitingListChange {
    @Tag(tag=4) public Integer controllerId = null;
    @Tag(tag=3) public Integer curIndex = null;
}
