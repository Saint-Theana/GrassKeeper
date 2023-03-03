package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetPlayDataNotify {
    @Tag(tag=12) public Integer playType = null;
    @Tag(tag=9) public Integer progress = null;
    @Tag(tag=6) public Integer entityId = null;
}
