package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBriefMuipData.*;
import org.sorapointa.proto.CustomDungeonBriefMuipData;

public class CustomDungeonBatchBriefMuipData {
    @Tag(tag=1) public List<CustomDungeonBriefMuipData> briefList = new ArrayList<>();
}
