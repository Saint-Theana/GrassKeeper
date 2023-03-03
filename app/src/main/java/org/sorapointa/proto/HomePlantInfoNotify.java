package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomePlantFieldData.*;
import org.sorapointa.proto.HomePlantFieldData;

public class HomePlantInfoNotify {
    @Tag(tag=4) public List<HomePlantFieldData> fieldList = new ArrayList<>();
}
