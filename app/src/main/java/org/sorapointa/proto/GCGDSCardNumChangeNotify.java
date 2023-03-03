package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardNumChangeNotify {
    @Tag(tag=4) public Integer cardId = null;
    @Tag(tag=10) public Integer num = null;
}
