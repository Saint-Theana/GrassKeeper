package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityShopSheetInfo {
    @Tag(tag=5) public Integer beginTime = null;
    @Tag(tag=14) public Integer sheetId = null;
    @Tag(tag=12) public Integer endTime = null;
}
