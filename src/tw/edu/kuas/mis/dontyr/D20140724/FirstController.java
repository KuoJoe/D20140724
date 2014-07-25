package tw.edu.kuas.mis.dontyr.D20140724;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FirstController {
	

    @RequestMapping("/User/{name}/{year}/{month}/{day}")
    public String helloWorld(Model model,@PathVariable("name") String name,@PathVariable("year") String year,
    		@PathVariable("month") String month,@PathVariable("day") String day
    		) {
        model.addAttribute("UserName", name);
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        model.addAttribute("day",day);
        
        
        
        int day1 = Integer.valueOf(day);
        int month1 = Integer.valueOf(month);
        int year1 = Integer.valueOf(year);
        
        
        
        String a=null;
        String b=null;
        switch(month1){
        case 1:
        if(day1 >=1 && day1 <=20){
        a="���������~�y�u�n�ܽT�w�@���P���A�N�|�ܫi���F�F�A�L�����������_�ӴN���D�F�C";
        b="Capricorn.jpg";
        break;
        }else if(day1>=21 && day1<=31){  
        a="���~�y���H���`�ݰ_�ӫܷd�ǡA�i�O�X���Y���û����O�L�A�]�����~�y���H�ܧC�աC";
        b="Aquarius.jpg";
        break;
        }
        case 2:
        if(day1 >=1 && day1 <=19){
        a="���~�y���H���`�ݰ_�ӫܷd�ǡA�i�O�X���Y���û����O�L�A�]�����~�y���H�ܧC�աC";
        b="Aquarius.jpg";
        break;
        }else if(day1>=20 && day1<=29){
        a="�����y���H�W�ƨ��N�O����ةʮ�A�b�L�P�ʰg�۪��t�@���A�N�O�z�ʻP�u�@�g�C";
        b="Pisces.jpg";
        break;
        }
        case 3:
        if(day1 >=1 && day1 <=20){
        a="�����y���H�W�ƨ��N�O����ةʮ�A�b�L�P�ʰg�۪��t�@���A�N�O�z�ʻP�u�@�g�C";
        b="Pisces.jpg";
        }else if(day1>=21 && day1<=31){
        a="�d�Ϯy���H���w²��A�]���b�~���N�|�h�ܦh�·СA�b�a�H�K�N�]�OOK���C �p�G�n�ЫȪ��ܡA�զϮy�]���@�N�ۤv�Ӱ���A�o�˥L�|ı�o�ܦ��N��A�]���Ϧӽm�N�F�@���n�p���C";
        b="Aries.jpg";
        break;
        }
        case 4:
        if(day1 >=1 && day1 <=20){
        	a="�d�Ϯy���H���w²��A�]���b�~���N�|�h�ܦh�·СA�b�a�H�K�N�]�OOK���C �p�G�n�ЫȪ��ܡA�զϮy�]���@�N�ۤv�Ӱ���A�o�˥L�|ı�o�ܦ��N��A�]���Ϧӽm�N�F�@���n�p���C";
        	b="Aries.jpg";
        	break;
        }else if(day1>=21 && day1<=30){
        	a="�����y���H���`�O�ܹ�ƨD�O�A�H�a�`�`�|���L�ȹꪺ�������F��F�A�ƹ�W�A�����y���H�n�A�߲����ܡA�@�}�l�N�A�F�A�ҥH�@�}�l�N�Q�L�F�F�C";
        	b="Taurus.jpg";
        	break;
        }
        case 5:
        if(day1 >=1 && day1 <=21){
        	a="�����y���H���`�O�ܹ�ƨD�O�A�H�a�`�`�|���L�ȹꪺ�������F��F�A�ƹ�W�A�����y���H�n�A�߲����ܡA�@�}�l�N�A�F�A�ҥH�@�}�l�N�Q�L�F�F�C";
        	b="Taurus.jpg";
        	break;
        }else if(day1>=22 && day1<=31){
        	a="���l�y���H�h�O�ܦn�j�g�`�b�~�H���e��{���ܸU��A�ҥH���藍�|���H���D�L���L�઺�ɭԡA�]�������ɭԬO���|���H�a�ݨ쪺�C";
        	b="Gemini.jpg";
        	break;
        }
        case 6:
        if(day1 >=1 && day1 <=21){
        	a="���l�y���H�h�O�ܦn�j�g�`�b�~�H���e��{���ܸU��A�ҥH���藍�|���H���D�L���L�઺�ɭԡA�]�������ɭԬO���|���H�a�ݨ쪺�C";
        	b="Gemini.jpg";
        	break;
        }else if(day1>=22 && day1<=30){
        	a="�泌�ɮy�ӻ��A�a���w�q����ءA�@�شN�O�a�x���u�a�v�A�@�شN�O�|�����a���u�a�v�C ";
        	b="Cancer.jpg";
        	break;
        }
        case 7:
        if(day1 >=1 && day1 <=23){
        	a="�泌�ɮy�ӻ��A�a���w�q����ءA�@�شN�O�a�x���u�a�v�A�@�شN�O�|�����a���u�a�v�C ";
        	b="Cancer.jpg";
        	break;
        }else if(day1>=24 && day1<=31){
        	a="���ɷ�l�y���H�|�@�ƪ��p�~���ˤl�A���L�b�˶̡A�ܦh�Ʊ��L���ݦb���̡C";
        	b="Leo.jpg";
        	break;
        }
        case 8:
        if(day1 >=1 && day1 <=23){
        	a="���ɷ�l�y���H�|�@�ƪ��p�~���ˤl�A���L�b�˶̡A�ܦh�Ʊ��L���ݦb���̡C";
        	b="Leo.jpg";
        	break;
        }else if(day1>=24 && day1<=31){
        	a="�B�k�y���H���`���|��{���@�ƹD�����M�A���ܤ]�O�a�ð�Ӫ��ˤl�A���L�`�|�Ǿ��Y�Y���G�A�o���H�a�L�k��L����`�A�o�@�I�O�B�k�y���H�ݤ��X�Ӫ��t�@���C";
        	b="Virgo.jpg";
        	break;
        }
        case 9:
        if(day1 >=1 && day1 <=23){
        a="�B�k�y���H���`���|��{���@�ƹD�����M�A���ܤ]�O�a�ð�Ӫ��ˤl�A���L�`�|�Ǿ��Y�Y���G�A�o���H�a�L�k��L����`�A�o�@�I�O�B�k�y���H�ݤ��X�Ӫ��t�@���C";
        b="Virgo.jpg";
        break;
        }else if(day1>=24 && day1<=30){
        	a="�ѯ��y���H�ݰ_�Ӥ��򳣦n�A�i�O��ڤW�O�H�]���|�b�L���W���줰��n�B�C";
        	b="Libra.jpg";
        	break;
        }
        case 10:
        if(day1 >=1 && day1 <=23){
        	a="�ѯ��y���H�ݰ_�Ӥ��򳣦n�A�i�O��ڤW�O�H�]���|�b�L���W���줰��n�B�C";
        	b="Libra.jpg";
        	break;
        }else if(day1>=24 && day1<=31){
        	a="���M���Ȯy���~��n�����o���B�ܼF�`�B����A����Ƴ��i�H�@���ݬ�A�ƹ�W�n�F�L���߬O�ܮe�����C";
        	b="Scorpio.jpg";
        	break;
        }
        case 11:
        if(day1 >=1 && day1 <=22){
        	a="���M���Ȯy���~��n�����o���B�ܼF�`�B����A����Ƴ��i�H�@���ݬ�A�ƹ�W�n�F�L���߬O�ܮe�����C";
        	b="Scorpio.jpg";
        	break;
        }else if(day1>=23 && day1<=30){
        	a="�p�G�O�g��y�w�g�ƥ��p���n���ơA�O���|�{�ɬ�����H�ӧ��ܪ��C";
        	b="Sagittarius.jpg";
        	break;
        }
        case 12:
        if(day1 >=1 && day1 <=22){
        	a="�p�G�O�g��y�w�g�ƥ��p���n���ơA�O���|�{�ɬ�����H�ӧ��ܪ��C";
        	b="Sagittarius.jpg";
        	break;
        }else if(day1>=23 && day1<=31){
        	a="���������~�y�u�n�ܽT�w�@���P���A�N�|�ܫi���F�F�A�L�����������_�ӴN���D�F�C";
        	b="Capricorn.jpg";
        	break;
        }
        
        model.addAttribute("Content", a);
        model.addAttribute("b", b);
        
        String deast=null;
        String c=null;
        switch(year1%12){
        case 1:
        	deast="��������A�B�B�;��A�H�H�®𽴫k�صM�@�s�A�b�j�N���������A���O���ƪ����~�A���M�묹�F�ͩR�A�o�쪺�N���o���Τ��B�ϡB�ޡC�q�e�j�Ҭ۬��}���A�ݥ�����ӡu���嬰���v�A�����i�H�Ψӥe�R�A����ﭷ�����A�ʻ������Y�o�}�ۤv���L�d�A�i�����O�j���ҩy���N�����C";
        	c="cc.jpg";
        	break;
        case 2:
        	deast="�۱q�H���H���y���Ͷ}�l�A���N�O�H���̿˪�̩��ꪺ�B�͡A�]�O�̭n�n���ͬ����A�u�n�M�H�b�@�_�A���@�w�������Y�A�o�ؿ˱K���Y�A�ۥj�ܤ��A���O��[���ܪ��C";
        	c="dd.jpg";
        	break;
        case 3:
        	deast="�ۥj�H�Ӥ���H���b�a���i�ޡA�����j��]�֤��F�e�A��P�H�������Y�`���A�@��H���H���ޤS�i�S�¡A��ڤW�ޫ��o���A�S�R�M��C";
        	c="p.jpg";
        	break;
        case 4:
        	deast="�ѹ���H���ӻ��A�O���Y�̱K�����ʪ��A�e���G�b���@�ɪ��C�@�Ө����A�u�n���H���a��N���ѹ��A�e�̴X�G�O�L�դ��J�A�L�}���p�A�L�צb����c�H�����ҡA���i�H�v�_���͡C";
        	c="m.jpg";
        	break;
        case 5:
        	deast="�U�y���G�u�����d���A�����d���C�v�N��O�����U���d���A�P�ɥX�o�A���M��F���ɶ����ߦ��O�A���P�˳��|��F�ت��a�A�����|�b�Ӽo�C";
        	c="c.jpg";
        	break;
        case 6:
        	deast="�P��L�ʪ�����A�Ѫ�o�ѿW�p�A�����өʤ��r�A�ӥB���A�A�S�ªZ���~���A�ڭ̱`ť���F�u���q�s�A���q��v�A�ӥj�H�H�C�s(�F)�B�ժ�(��)�B����(�n)�B�ȪZ(�_)���|�F�V���~�A�H�x�|��Υ|�u�A��O�O�H�q�ӻ������u�@���C";
        	c="t.jpg";
        	break;
        case 7:
        	deast="�ߤl���өʤQ���X���A�ϩ����S���~���¶��A�O����a�M�֥i�H�A���O�p�G�H���ߤl�ũM�n�۫V�A���N�j���S���F�A�u�ߨ��e�Q��v�A�ήe�ߤl�ʧ@�ӱ��F�u���ߤT�]�v�A�N�i�H�ݥX�ߤl�O�󵥪��`�ѻ��{�F�u�ߤl���Y�����v�A�i���ߤl�Q��ĵ�٩P�����ҡF�ߤl�R�Y��O�H�ɬҪ��A�Өߤl����w�Y���l�ӿi���N�A���H���C";
        	c="r.jpg";
        	break;
        case 8:
        	deast="�s�O�Q�G�ͨv���A�ߤ@��c�A�ǻ������窫���~�A�O����H�ҳСA�]���F����ǲΤ�ƪ��@�����A���O�ɥN�ܾE�A�����s��g�`�b���j�y��W�C���C";
        	c="d.jpg";
        	break;
        case 9:
        	deast="�D�A�S�W�p�s�κ٪��ΡA�O�]��ʪ��A�ʳ߸����B�p�}�Φb��a���C���A�A�񪺥~��A���H�~�H�A�S���}�A�a��������B�ʫe�i�A�j�D���ȤH�A�p�D�ȤH�A�D����O�����C";
        	c="s.jpg";
        	break;
        case 10:
        	deast="���O�@�ط����H�߷R���ʪ��A�ѥͦ�ʧֳt�A�ʮ次��}�ԡA�j�H���L�u��Ѳ��p�s�A��a���p���v�A�u���̡A�ҧL�����A�ꤧ�j�Ρv�A���O�F�������A�ۥj�H�ӡA�W�N�M�W�s���θܤ��֡A���ЩM�Q񶪺�G�Ƴ��z���H�f�O�H��ġC";
        	c="h.jpg";
        	break;
        case 11:
        	deast="����Ѧr�W���G�u�Ϫ̲��]�v�A�j�N����Ѥl�ѫJ�����ѫ~������(���B�ϡB��)�A���O���t���窺�A�Ѧ��i���u�ϡv�b�j�H�ߥؤ��A�O�@�طŤ��������}�w�����ʪ��A�`�O���P�H���a�C�Y���Z�C��A�åB�ߥ����R�����B�ۡC";
        	c="ss.jpg";
        	break;
        case 0:
        	deast="�b�F���媺�i�ƽפ��A�H���������O�U�l�A�U�l�g�L�F���ɶ����t�ܶi�Ƭ��H�C�U���_���ӥ��n�k�̤H�ҤH�ˡA�~���X���O�Q�G�ͨv���̡C";
        	c="mm.jpg";
        	break;
        	
        }
        
        model.addAttribute("deast", deast);
        model.addAttribute("c", c);
        
        
        
    }
        return "helloWorld";
    }
}