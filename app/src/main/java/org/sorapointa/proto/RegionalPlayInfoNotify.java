package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionalPlayVar.*;
import org.sorapointa.proto.RegionalPlayVar;

public class RegionalPlayInfoNotify {
    @Tag(tag=5) public List<RegionalPlayVar> varList = new ArrayList<>();
    @Tag(tag=9) public String playName = null;
    @Tag(tag=15) public Boolean isEnabled = null;
    @Tag(tag=7) public Integer playType = null;
    @Tag(tag=4) public Boolean isInRegion = null;
}
