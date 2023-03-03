package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DeshretObeliskChestInfo.*;
import org.sorapointa.proto.DeshretObeliskChestInfo;

public class DeshretObeliskChestInfoNotify {
    @Tag(tag=14) public List<DeshretObeliskChestInfo> chestInfoList = new ArrayList<>();
}
