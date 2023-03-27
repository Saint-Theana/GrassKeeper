package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MailItem {
    @Tag(tag=1) public EquipParam equipParam = null;
    @Tag(tag=2) public MaterialDeleteInfo deleteInfo = null;
}
