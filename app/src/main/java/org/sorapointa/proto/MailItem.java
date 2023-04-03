package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EquipParam.*;
import org.sorapointa.proto.EquipParam;
import org.sorapointa.proto.MaterialDeleteInfo.*;
import org.sorapointa.proto.MaterialDeleteInfo;

public class MailItem {
    @Tag(tag=1) public EquipParam equipParam = null;
    @Tag(tag=2) public MaterialDeleteInfo deleteInfo = null;
}
