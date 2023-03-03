package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SkyCrystalDetectorData.*;
import org.sorapointa.proto.SkyCrystalDetectorData;

public class SkyCrystalDetectorQuickUseResult {
    @Tag(tag=9) public SkyCrystalDetectorData skyCrystalDetectorData = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
